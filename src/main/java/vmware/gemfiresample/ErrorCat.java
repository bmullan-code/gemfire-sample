package vmware.gemfiresample;


import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.annotation.Region;


@Region(value = "ErrorCat")
public class ErrorCat implements Serializable {

		@Id
		private final String id;
		
		private final String shortDesc;
		
		private final String longDesc;


		public ErrorCat(String id, String shortDesc, String longDesc) {
			super();
			this.id = id;
			this.shortDesc = shortDesc;
			this.longDesc = longDesc;
		}


		public String getId() {
			return id;
		}


		public String getShortDesc() {
			return shortDesc;
		}


		public String getLongDesc() {
			return longDesc;
		}


		@Override
		public String toString() {
			return String.format("(%s,%s,%s)", getId(),getShortDesc(),getLongDesc());
		}
	}
