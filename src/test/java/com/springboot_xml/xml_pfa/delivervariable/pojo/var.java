package com.springboot_xml.xml_pfa.delivervariable.pojo;

import com.springboot_xml.xml_pfa.delivervariable.DVTEst;
import org.junit.Test;

/**
 * @ProjectName: xml_pfa
 * @Package: com.springboot_xml.xml_pfa.delivervariable.pojo
 * @ClassName: var
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/6/1 13:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/6/1 13:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class var {
    @Test
    public void getvar(){
        //这样直接调用是null。因为var赋值是在deliver中。直接拿是还没有赋值。所以是空。
        System.out.println(new DVTEst().getVar());
//这样才会有值。。。
        DVTEst d = new DVTEst();
        d.deliver();
        System.out.println( d.getVar());


    }

}
