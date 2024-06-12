package fr.codecake.airbnbcloneback.listing.repository;


import fr.codecake.airbnbcloneback.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
