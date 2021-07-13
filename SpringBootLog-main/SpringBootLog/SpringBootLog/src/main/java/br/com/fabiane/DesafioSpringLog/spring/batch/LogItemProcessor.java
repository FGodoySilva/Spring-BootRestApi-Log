package br.com.fabiane.DesafioSpringLog.spring.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.sun.istack.logging.Logger;

import br.com.fabiane.DesafioSpringLog.model.LogModel;

/**
 * 
 * @author fabiane godoy
 *
 */


@Component
public class LogItemProcessor implements ItemProcessor<LogModel, LogModel> {

	private static Logger logger = Logger.getLogger(LogItemProcessor.class);

	@Override
	public LogModel process(LogModel log) throws Exception {
		LogModel logConverted = new LogModel(log.getCreatedAt(), log.getIp(), log.getRequest(), log.getStatus(),
				log.getUserAgent());
		logger.info("Log converting (" + log + ") into (" + logConverted + ")");
		return logConverted;
	}
}
