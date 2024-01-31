package th.ac.kku.lab_pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface PokemonApi {
    @Headers(
        "Accept: application/json"
    )
    @GET("pokemon")
    abstract fun getPokemonList() : Call<PokemonList>
}