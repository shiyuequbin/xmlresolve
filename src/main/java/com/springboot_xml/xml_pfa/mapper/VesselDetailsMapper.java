package com.springboot_xml.xml_pfa.mapper;


import com.springboot_xml.xml_pfa.domain.VesselDetails;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: springboot
 * @Package: com.example.springboot.mapper
 * @ClassName: UserMapper
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/19 22:19
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/19 22:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Repository
public interface VesselDetailsMapper {
    int insert(VesselDetails vesselDetails);
}
