package bellakratchei.com.github.JavaAPI.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import bellakratchei.com.github.JavaAPI.models.Aula;

public interface AulaRepository extends JpaRepository<Aula, Long> {

	Aula findById(long id);
}
