package cn.neuedu.his.mapper;

import cn.neuedu.his.model.Patient;
import cn.neuedu.his.util.inter.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface PatientMapper extends MyMapper<Patient> {
    Patient searchPatientAndFrozenPayment(@Param("patientId") Integer patientId, @Param("noPaymentTotalTypeId") Integer noPaymentTotalTypeId, @Param("state") Integer state);
    Patient searchPatientAndNotConsumePayment(@Param("patientId") Integer patientId, @Param("noPaymentTotalTypeId") Integer noPaymentTotalTypeId);
}