package cx.controller;




import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


/**
 * Created by Administrator on 2017-9-29.
 */
@RequestMapping("/fileUpload")
@Controller
public class FileUpload {


    @ResponseBody
    @RequestMapping(value = "/importPicFile",method = RequestMethod.POST)
    public String upload(HttpServletRequest request, @RequestParam("myFile") MultipartFile file,
                         ModelMap model){
        System.out.println("Start");
        String path = request.getSession().getServletContext().getRealPath("/upload");
        String filename = file.getOriginalFilename();
        System.out.println(path);
        File f = new File(path, filename);
        if (!f.exists()&& !f.isDirectory()){
            f.mkdirs();
        }

        try{
            file.transferTo(f);
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("fileUrl",request.getContextPath()+"/upload/"+filename);
        return "success";
    }



    /**
     * 文件下载
     * @param request
     * @param filename
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/download")
    public ResponseEntity<byte[]> downLoad(HttpServletRequest request, @RequestParam("filename") String filename,
             Model model)throws Exception{

        //下载文件路径
        String path = request.getServletContext().getRealPath("/upload");
        File file = new File(path + File.separator + filename);
        HttpHeaders headers = new HttpHeaders();
        //下载显示的文件名，解决中文名称乱码的问题
        String downloadFileName = new String(filename.getBytes("UTF-8"), "iso-8859-1");
        //通知浏览器以attachment(下载方式)打开文件
        headers.setContentType(MediaType.ALL.APPLICATION_OCTET_STREAM);
        return  new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }






}
