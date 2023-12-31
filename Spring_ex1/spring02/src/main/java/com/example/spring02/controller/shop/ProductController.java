package com.example.spring02.controller.shop;

import java.io.File;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring02.model.shop.dto.ProductDTO;
import com.example.spring02.service.shop.ProductService;

@Controller
@RequestMapping("/shop/product/*")//공통url
public class ProductController {
	@Inject
	ProductService productService;
	
	@RequestMapping("list.do")//세부url
	public ModelAndView list(ModelAndView mav) {
		mav.setViewName("/shop/product_list");
		mav.addObject("list", productService.listProduct());
		return mav;
	}
	
	//Restful 한 uri
	@RequestMapping("detail/{product_id}")
	public ModelAndView detail(@PathVariable int product_id, ModelAndView mav) {
		mav.setViewName("/shop/product_detail");
		mav.addObject("dto", productService.detailProduct(product_id));
		return mav;
	}
	//상품등록
	@RequestMapping("insert.do")
	public String insert(@ModelAttribute ProductDTO dto) {
		String filename="-";
		//첨부파일이 있으면 
		if(!dto.getFile1().isEmpty()) {
			//첨부파일의 이름 처리
			filename=dto.getFile1().getOriginalFilename();
			try {
				//배포디렉토리
				//디렉토리 구분자 : \(윈도우즈), /(유닉스, 리눅스)
				//따옴표 안의 특수문자는 \를 추가
				String path="C:\\work\\.metadata\\.plugins"
						+ "\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\spring02\\WEB-INF\\views\\images\\";
				new File(path).mkdir();
				//임시디렉토리에 저장된 첨부파일을 이동
				dto.getFile1().transferTo(new File(path+filename));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		dto.setPicture_url(filename);
		productService.insertProduct(dto);
		return "redirect:/shop/product/list.do";
	}
	
	@RequestMapping("edit/{product_id}")
	public ModelAndView edit(@PathVariable("product_id") int product_id, ModelAndView mav) {
		mav.setViewName("shop/product_edit");
		mav.addObject("dto",productService.detailProduct(product_id));//전달데이터
		return mav;
	}
	
	@RequestMapping("update.do")
	public String update(ProductDTO dto) {
		//insert 식과 거의 같음
		String filename="-";
		if(!dto.getFile1().isEmpty()) {
			filename=dto.getFile1().getOriginalFilename();
			try {
				String path="C:\\work\\.metadata\\.plugins"
						+ "\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\spring02\\WEB-INF\\views\\images\\";
				new File(path).mkdir();
				dto.getFile1().transferTo(new File(path+filename));
			} catch (Exception e) {
				e.printStackTrace();
			}
			dto.setPicture_url(filename);
		}else {//새 첨부파일이 없을경우
			//기존파일정보를 가져와야 함
			ProductDTO dto2 = productService.detailProduct(dto.getProduct_id());
			dto.setPicture_url(dto2.getPicture_url());
		}
		//상품정보 수정
		productService.updateProduct(dto);
		return "redirect:/shop/product/list.do";
	}
	@RequestMapping("delete.do")
	public String delete(@RequestParam int product_id) {
		String filename=productService.fileInfo(product_id);
		if(filename != null && !filename.equals("-")) {
			String path="C:\\work\\.metadata\\.plugins"
					+ "\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\spring02\\WEB-INF\\views\\images\\";
			File f= new File(path+filename);
			System.out.println("파일존재여부 : "+f.exists());
			if(f.exists()) {//파일이 존재하면
				f.delete();//파일삭제
				System.out.println("파일이 삭제되었습니다.");
			}
		}//if
		productService.deleteProduct(product_id);
		return "redirect:/shop/product/list.do";
	}
	
	
}
