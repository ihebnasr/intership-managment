package com.bezkoder.spring.security.postgresql.services;

import com.bezkoder.spring.security.postgresql.dtos.TaskAssignmentDto;
import com.bezkoder.spring.security.postgresql.dtos.TaskDto;
import com.bezkoder.spring.security.postgresql.entities.TaskAssignment;
import com.bezkoder.spring.security.postgresql.exceptions.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<TaskDto> searchTasks(String s);

    TaskDto getTask(Long id) throws ResourceNotFoundException;

    TaskDto updateTask(TaskDto taskDto);

    void deleteTask(Long id);

    ResponseEntity<List<TaskDto>> getAllTasksByInternshipId(Long id) throws ResourceNotFoundException;

    ResponseEntity<TaskDto> createTask(Long id, TaskDto taskDto) throws ResourceNotFoundException;

    ResponseEntity<TaskAssignment> createTaskAssignment(Long id, TaskAssignmentDto taskAssignment) throws IOException;

    Optional<Object> getAllFiles();

    TaskAssignment getFile(String id);
}
