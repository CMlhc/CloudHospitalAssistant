package cn.neuedu.his.controller;

import cn.neuedu.his.service.MedicalRecordService;
import cn.neuedu.his.util.CommonUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by ccm on 2019/05/24.
 */
@RestController
@RequestMapping("/medical_record")
public class MedicalRecordController {

    @Autowired
    MedicalRecordService medicalRecordService;

}
