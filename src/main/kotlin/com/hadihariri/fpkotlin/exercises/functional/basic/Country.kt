package com.hadihariri.fpkotlin.exercises.functional.basic


data class City(val name: String, val region: String, val population: Int)

data class Country(val name: String, val capital: String, val continent: String, val population: Int, val cities: List<City>)


val countries = listOf(
        Country("Australia", "Canberra", "Oceania", 23837400,
                listOf(City("Sydney", "New South Wales", 4840600),
                        City("Melbourne", "Victoria", 4442919),
                        City("Brisbane", "Queensland", 2274600)
                )
        ),
        Country("Bolivia", "Sucre", "America", 10556102,
                listOf(City("Santa Cruz", "Andres Ibanez", 1453549),
                        City("La Paz", "Pedro Dominguez", 1184942)
                )
        ),
        Country("China", "Beijing", "Asia", 1357380000,
                listOf(City("Shanghai", "Shanghai", 20217700),
                        City("Guangzhou", "Guangdong", 10641400),
                        City("Wuhan", "Hubei", 7541500),
                        City("Xi'an", "Shaanxi", 5399300)
                )
        ),
        Country("Germany", "Berlin", "Europe", 80176000,
                listOf(City("Munich", "Bavaria", 1353186),
                        City("Hamburg", "Hamburg", 1786448),
                        City("Dresden", "Saxony", 523058),
                        City("Nuremberg", "Bavaria", 505664),
                        City("Bonn", "North Rhine-Westphalia", 324889)
                )
        ),
        Country("Norway", "Oslo", "Europe", 5136700,
                listOf(City("Bergen", "Hordaland", 247731),
                        City("Trondheim", "Sør-Trøndelag", 169972),
                        City("Askøy", "Hordaland", 21438),
                        City("Tønsberg", "Vestfold", 49735),
                        City("Larvik", "Vestfold", 23523)
                )
        ),
        Country("United Kingdom", "London", "Europe", 64511000,
                listOf(City("Manchester", "Greater Manchester", 2553379),
                        City("Liverpool", "Mersyside", 864122),
                        City("Bristol", "South West", 617280),
                        City("Plymouth", "South West", 261384),
                        City("Newcastle", "Tyne and Wear", 774891)
                )
        )



)