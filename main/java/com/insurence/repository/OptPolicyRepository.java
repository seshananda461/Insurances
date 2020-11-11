package com.insurence.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurence.entity.CustomerPolicy;

@Repository
public interface OptPolicyRepository extends JpaRepository<CustomerPolicy, Long> {

	Page<CustomerPolicy> findBycustomerId(int customerId, Pageable pageable);

}
