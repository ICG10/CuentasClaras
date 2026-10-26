package com.cuentasclaras.group.repository;

import com.cuentasclaras.group.domain.ExpenseGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseGroupRepository extends JpaRepository<ExpenseGroup, Long> {
}