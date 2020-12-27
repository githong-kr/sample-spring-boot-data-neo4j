package com.bale.kabang.samplespringbootdataneo4j.user;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Long> {
}
