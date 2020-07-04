package com.lty.controller;


import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


//文件下载功能，注意路径，文件夹存在；

@Controller
public class fileDownload {

    @PostMapping("/download")
    public String down(String name, MultipartFile image, HttpServletRequest request) throws IOException {
        System.out.println("来自用户：" + name);
        System.out.println("上传图片名称：" + image.getName());


        String contentType = image.getContentType();


        //动态获取上传文件夹的路径
        ServletContext context = request.getServletContext();
        System.out.println("context=>"+context);

        String realPath = context.getRealPath("/upload");//获取本地存储位置的绝对路径
        System.out.println("realPath=>"+realPath);

        String filename = image.getOriginalFilename();//获取上传时的文件名称
        System.out.println("filename=>"+filename);

        filename = UUID.randomUUID().toString()+"."+ FilenameUtils.getExtension(filename);//创建一个新的文件名称    getExtension(name):获取文件后缀名

        File aim = new File(realPath);
        if (!aim.exists()){
            aim.mkdirs();
        }

        File f= new File(realPath, filename);
        image.transferTo(f);//将上传的文件存储到指定位置


        return "hello";
    }
}
