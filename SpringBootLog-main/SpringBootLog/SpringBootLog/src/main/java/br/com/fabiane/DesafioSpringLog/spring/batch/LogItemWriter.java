package br.com.fabiane.DesafioSpringLog.spring.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fabiane.DesafioSpringLog.model.LogModel;
import br.com.fabiane.DesafioSpringLog.service.LogService;

/**
 * 
 * @author fabiane godoy
 *
 */

@Component
public class LogItemWriter implements ItemWriter<LogModel> {

    @Autowired
    private LogService logService;

    @Override
    public void write(List<? extends LogModel> logs) throws Exception {
        System.out.println("Data Saved for logs: " + logs);
        logService.saveAll(logs);
    }
}
