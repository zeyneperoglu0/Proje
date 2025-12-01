package eticaret;


import java.util.List;

public interface Repository <S,U> {




void createTable();


int save (S entity);


List<S> findAll ();


void update(S entity,U id);


void deleteById(U id);


S findById (U id);




























}
