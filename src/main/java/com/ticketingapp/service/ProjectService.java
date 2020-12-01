package com.ticketingapp.service;

import com.ticketingapp.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO, String> {

    void complete(ProjectDTO project);

}
