package project.database.taxiplan.service.job;

import project.database.taxiplan.model.Job;

public interface JobService {

	void persistJob(Job job);

	Job findJobById(String id);

	void updateJob(Job job);

	void deleteJob(Job job);
}
