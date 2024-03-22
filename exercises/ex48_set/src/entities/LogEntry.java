package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry implements Comparable<LogEntry>{

	private String userName;
	private Instant date;
	
	public LogEntry(String userName, Instant date) {
		this.userName = userName;
		this.date = date;
	}

	public String getUserName() {
		return userName;
	}

	public Instant getDate() {
		return date;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(userName, other.userName);
	}

	@Override
	public int compareTo(LogEntry o) {
		return userName.compareTo(o.getUserName());
	}
	
	
}
