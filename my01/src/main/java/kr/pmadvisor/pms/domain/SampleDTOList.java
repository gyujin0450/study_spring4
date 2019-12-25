package kr.pmadvisor.pms.domain;

import java.util.ArrayList;
import java.util.List;

public class SampleDTOList {
	
	private List<SampleDTO> list;
		
	public SampleDTOList() {
		list = new ArrayList<>();
	}

	// getter/setter, equals, toString() 생성
	public List<SampleDTO> getList() {
		return list;
	}

	public void setList(List<SampleDTO> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		SampleDTOList other = (SampleDTOList) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SampleDTOList [list=" + list + "]";
	}
	
	
	

}
