package com.ticketingapp.implementations;

import com.ticketingapp.dto.TaskDTO;
import com.ticketingapp.dto.UserDTO;
import com.ticketingapp.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO, Long> implements TaskService {

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public TaskDTO save(TaskDTO object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void update(TaskDTO object) {
        object.setAssignedDate(findById(object.getId()).getAssignedDate());
        object.setTaskStatus(findById(object.getId()).getTaskStatus());
        super.update(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(TaskDTO object) {
        super.delete(object);
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }


    @Override
    public List<TaskDTO> findTasksByManager(UserDTO manager) {
        return super.findAll().stream()
                .filter(task -> task.getProject().getAssignedManager().equals(manager))
                .collect(Collectors.toList());
    }

    @Override
    public List<TaskDTO> getCompleted() {
        return super.findAll().stream().filter(task -> task.getTaskStatus().getValue().equals("Complete")).collect(Collectors.toList());
    }

    @Override
    public List<TaskDTO> getNotCompleted() {
        return super.findAll().stream().filter(task -> !task.getTaskStatus().getValue().equals("Complete")).collect(Collectors.toList());
    }
}
