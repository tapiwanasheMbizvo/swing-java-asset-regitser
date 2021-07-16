/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.ophid.assetregister.categories;

/**
 *
 * @author tmbizvo
 */
public class Category {
    
    
    private Long id;
    
    private String categoryName;
    
    private String description;

    public Category(
            String categoryName,
            String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    
    public Category(
            Long id, 
            String categoryName,
            String description) {
        
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
