package kr.co.ezen.mapper;

import java.util.List;

import kr.co.ezen.entity.Criteria;
import kr.co.ezen.entity.Gp;
import kr.co.ezen.entity.GpUser;

public interface GpMapper {
	
	public List<Gp> findAll(Criteria cri);
	public int totalCount(Criteria cri);
	public Gp findByIdx(int gp_idx);
	public List<GpUser> findByUser(int user_idx);
	public void updateByIdx(Gp vo);
	public void deleteByIdx(int gp_idx);
	public void insert(Gp vo);

}
