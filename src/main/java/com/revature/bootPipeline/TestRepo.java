package com.revature.bootPipeline;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends CrudRepository<Member, String> {
}
