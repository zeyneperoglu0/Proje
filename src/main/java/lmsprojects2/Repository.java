package lmsprojects2;

import java.util.List;
import java.util.Map;

public interface Repository <S,U> {


void createTable();


void save(S entity);

List<S> findAll();

void update(S entity , U id);

void deletedById(U id);

S findById(U id);








}
