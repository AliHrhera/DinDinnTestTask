package ali.hrhera.dindinntestapp.data.repository

import ali.hrhera.dindinntestapp.data.models.OneItem
import ali.hrhera.dindinntestapp.data.newtwork.AppApiClint
import ali.hrhera.dindinntestapp.util.intfaces.Repository
import io.reactivex.Single

class SliderRepository() : Repository() {
    override fun getItems(): Single<List<OneItem>> =AppApiClint.getInstance().getSliderItem()


}