package vmware.gemfiresample;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.annotation.Region;


@Region(value = "Sentiment")
public class Sentiment implements Serializable {

	@Id
	private final String name;

	public String getName() {
		return name;
	}

	public String getSentiment() {
		return sentiment;
	}

	private final String sentiment;

	public Sentiment(String sentiment) {
		this.name = UUID.randomUUID().toString();
		this.sentiment = sentiment;
	}

	@Override
	public String toString() {
		return String.format("Sentiment:%s", getSentiment());
	}
}
