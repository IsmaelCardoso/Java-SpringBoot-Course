package entities;

public class StudentsRecord {
	
	private Integer studentRecord;

	public StudentsRecord(Integer studentRecord) {
		this.studentRecord = studentRecord;
	}

	public Integer getStudentRecord() {
		return studentRecord;
	}

	public void setStudentRecord(Integer studentRecord) {
		this.studentRecord = studentRecord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentRecord == null) ? 0 : studentRecord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentsRecord other = (StudentsRecord) obj;
		if (studentRecord == null) {
			if (other.studentRecord != null)
				return false;
		} else if (!studentRecord.equals(other.studentRecord))
			return false;
		return true;
	}
}
