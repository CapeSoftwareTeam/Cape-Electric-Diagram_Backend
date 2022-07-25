package com.capeelectric.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.capeelectric.model.ResponseFile;

public interface FileUploadRepository extends CrudRepository<ResponseFile, Integer> {

	Optional<ResponseFile> findByNodeId(String nodeId);

}
