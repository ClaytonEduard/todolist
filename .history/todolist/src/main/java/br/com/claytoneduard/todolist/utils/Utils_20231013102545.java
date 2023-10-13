package br.com.claytoneduard.todolist.utils;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

    public String[] getNullPropertNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);

        // obtendo as propriedades do objeto
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

    }
}
