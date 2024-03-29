package com.example.todoapispring;

import org.springframework.stereotype.Service;

@Service("fakeTodoService")
public class FakeTodoService implements TodoService{
    @Override
    public String doSomething() {
        return "Something from fake todo service";
    }
}
