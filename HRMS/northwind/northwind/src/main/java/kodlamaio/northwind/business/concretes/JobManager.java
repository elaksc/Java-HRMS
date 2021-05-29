package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobService;
import kodlamaio.northwind.dataAccess.abstracts.JobDao;
import kodlamaio.northwind.entities.concretes.Job;

@Service //Business katmanı olduğunu belirtiyoruz 
public class JobManager implements JobService {

	private JobDao jobDao;
	@Autowired //JabDoya karşılık gelen sınıfı buna yerleştiriyor
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	
	@Override
	public List<Job> getAll() {
		
		return this.jobDao.findAll();
	}

}
