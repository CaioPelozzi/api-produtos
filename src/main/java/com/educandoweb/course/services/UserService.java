package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User u) {
        return repository.save(u);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User update(Long id, User u) {
        User entity = repository.getReferenceById(id);
        updateData(entity, u);
        return repository.save(entity);
    }

    private void updateData(User entity, User u) {
        entity.setName(u.getName());
        entity.setEmail(u.getEmail());
        entity.setPhone(u.getPhone());
    }


}
