package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // this class is a business object.
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository1;
	}

	@Override
	public List<Brand> getAll() {
		// Business Rules

		return brandRepository.getAll();
	}

}
