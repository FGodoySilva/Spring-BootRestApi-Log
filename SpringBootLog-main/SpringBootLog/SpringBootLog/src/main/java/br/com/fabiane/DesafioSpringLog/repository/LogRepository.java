package br.com.fabiane.DesafioSpringLog.repository;

import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import br.com.fabiane.DesafioSpringLog.model.LogModel;

/**
 * 
 * @author fabiane godoy
 *
 */
 

public interface LogRepository extends LogRespositoryDAO<LogModel>{

	public List<LogModel> findLogModelsByIpIsContaining(String ip);
	
	public List<LogModel> findLogModelsByStatus(Integer status);
	
	public List<LogModel> findLogModelsByCreatedAtBetween(Date from, Date to);

	public Object findById(long l);

}
