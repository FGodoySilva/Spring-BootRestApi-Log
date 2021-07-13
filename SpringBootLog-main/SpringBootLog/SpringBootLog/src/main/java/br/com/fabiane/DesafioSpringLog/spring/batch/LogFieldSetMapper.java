package br.com.fabiane.DesafioSpringLog.spring.batch;

import java.util.Date;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import br.com.fabiane.DesafioSpringLog.model.LogModel;
import br.com.fabiane.DesafioSpringLog.utils.Formatting;

/**
 * 
 * @author fabiane godoy
 *
 */

public class LogFieldSetMapper implements FieldSetMapper<LogModel> {

	@Override
	public LogModel mapFieldSet(FieldSet fieldSet) {
		LogModel logItem = null;
		try {
			Date createdAt = Formatting.stringToDate_yyyy_MM_dd__HH_mm_ss(fieldSet.readString(0));
			String ip = fieldSet.readString(1);
			String request = fieldSet.readString(2);
			Integer status = fieldSet.readInt(3);
			String userAgent = fieldSet.readString(4);
			logItem = new LogModel(createdAt, ip, request, status, userAgent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return logItem;
	}

}
