package vmware.gemfiresample;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface CustomerRepository extends CrudRepository<Sentiment, String> {

  Iterable<Sentiment> findByName(String sentiment);

}