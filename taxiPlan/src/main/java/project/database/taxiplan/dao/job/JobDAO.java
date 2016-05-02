package project.database.taxiplan.dao.job;

import project.database.taxiplan.model.Job;

public interface JobDAO {

		  void persistJob(Job job);

		  Job findJobById(String id);

		  void updateJob(Job job);

		  void deleteJob(Job job);

}
