package project.database.taxiplan.service.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.database.taxiplan.dao.job.JobDAO;
import project.database.taxiplan.model.Job;

@Service("jobService")
public class JobServiceImpl implements JobService{

	@Autowired
	JobDAO jobDAO;

	@Override
	@Transactional
	public void persistJob(Job job) {
		jobDAO.persistJob(job);

	}

	@Override
	@Transactional
	public void updateJob(Job job) {
		jobDAO.updateJob(job);

	}
	@Override
	@Transactional
	public Job findJobById(String id) {
		return jobDAO.findJobById(id);
	}

	@Override
	@Transactional
	public void deleteJob(Job job) {
		jobDAO.deleteJob(job);

	}

}
