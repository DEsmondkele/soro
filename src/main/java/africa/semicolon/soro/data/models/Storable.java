package africa.semicolon.soro.data.models;

import lombok.Data;

@Data
public abstract class Storable {
    public  abstract  void setId(Integer id);

    public abstract Integer getId();
}
