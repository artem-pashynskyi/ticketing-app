package com.ticketingapp.service;

import com.ticketingapp.dto.TaskDTO;
import com.ticketingapp.dto.UserDTO;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO, Long> {
    List<TaskDTO> findTasksByManager(UserDTO manager);
}
