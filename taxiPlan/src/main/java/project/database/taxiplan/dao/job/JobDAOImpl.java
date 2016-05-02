package project.database.taxiplan.dao.job;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.database.taxiplan.model.Job;

@Repository("jobDAO")
public class JobDAOImpl implements JobDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void persistJob(Job job) {
		sessionFactory.getCurrentSession().persist(job);
	}

	@Override
	public Job findJobById(String id) {
		return (Job) sessionFactory.getCurrentSession().get(Job.class, id);
	}

	@Override
	public void updateJob(Job job) {
		sessionFactory.getCurrentSession().update(job);

	}
	@Override
	public void deleteJob(Job job) {
		sessionFactory.getCurrentSession().delete(job);
	}

}
