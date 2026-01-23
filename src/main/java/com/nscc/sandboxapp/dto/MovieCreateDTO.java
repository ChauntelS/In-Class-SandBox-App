package com.nscc.sandboxapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MovieCreateDTO {

    @NotNull // controller validation
    @NotBlank(message ="Title is required.") // controller validation
    private String Title;

    @NotNull
    @NotBlank(message ="Synopsis is required.")
    @Size(max=100)
    private String synopsis;

    // no ID field - this is generated in the database, not as incoming input
}
