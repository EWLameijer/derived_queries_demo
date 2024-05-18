package org.ericwubbo.derivedqueriesdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findAllByNameContainingIgnoringCase(String query);
}
