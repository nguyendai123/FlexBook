package com.example.facebookclone.controller;

import com.example.facebookclone.model.Users;
import com.example.facebookclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping(value = {"","/"})
    public String index(Model model){
        List<Users> users = service.getAllUsers();
        model.addAttribute("users",users);
        return "admin/user/index";

    }
    @GetMapping("/create")
    public String create(Model model){

        model.addAttribute("users", new Users());
        return "admin/user/add";
    }

    @PostMapping(value = {"/", ""})
    public String store( Users users){
        try {
            service.saveUsers(users);
            System.out.println(service.getAllUsers());
        } catch (Exception e) {
            return null;

        }
        return "redirect:/users/";
    }
//
//    @GetMapping("/{id}/delete")
//    public String deleteProduct(@PathVariable Long id) {
//        try {
//            service.deleteProduct(id);
////            System.out.println(service.getProducts());
//        } catch (Exception e) {
//            return null;
//        }
//        return "redirect:/products/";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(@PathVariable Long id, Model model) {
//        Product product = service.getProductById(id);//
//        model.addAttribute("product", product);//
//        return "admin/product/edit";
//    }
//
//    @PostMapping("/update")
//    public String update(@ModelAttribute Product product) {
//        service.updateProduct(product);
//        return "redirect:/products/";
//    }

}
