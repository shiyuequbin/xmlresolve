package com.springboot_xml.xml_pfa.controller;

import com.springboot_xml.xml_pfa.service.PFAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: xml_pfa
 * @Package: com.springboot_xml.xml_pfa.controller
 * @ClassName: PFAController
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/22 13:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/22 13:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
public class PFAController {
    private  String path;



    @Autowired
    private PFAService pfaService;

    @PostMapping("/save")
    public void savePFA(@RequestParam String p) throws Exception {
       path = p;
      //  System.out.println(path+"++++++++++++");
        pfaService.savePFA(path);
    }

}
