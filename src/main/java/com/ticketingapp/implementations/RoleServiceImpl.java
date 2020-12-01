package com.ticketingapp.implementations;

import com.ticketingapp.dto.RoleDTO;
import com.ticketingapp.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractMapService<RoleDTO, Long> implements RoleService {

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public RoleDTO save(RoleDTO role) {
        return super.save(role.getId(), role);
    }

    @Override
    public void update(RoleDTO object) {
        super.update(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(RoleDTO role) {
        super.delete(role);
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

}
