"""
# python file (your_name.py)
# think of an item (15) that have different attributes
# create a dictionary from that item with attributes as
#    values
# perform adding items, updating items, removing items,
#    clear items
"""

celestial_bodies = {"mercury": {"type": "planet", "diameter": "4,879.4 km", "temperature": "167 C"},
                    "venus": {"type": "planet", "diameter": "12,104 km", "temperature": "475 C"},
                    "earth": {"type": "planet", "diameter": "12,742 km", "temperature": "15 C"},
                    "mars": {"type": "planet", "diameter": "6,778 km", "temperature": "-65 C"},
                    "sirius": {"type": "star", "diameter": "2.4 million km", "temperature": "9,400 C"},
                    "saturn": {"type": "planet", "diameter": "116,460 km", "temperature": "-140 C"},
                    "uranus": {"type": "planet", "diameter": "50,724 km", "temperature": "-195 C"},
                    "neptune": {"type": "planet", "diameter": "49,244 km", "temperature": "-200 C"},
                    "pluto": {"type": "planet", "diameter": "2,376.9 km", "temperature": "-231 C"},
                    "sun": {"type": "star", "diameter": "1.3927 million km", "temperature": "5600 C"},
                    "halleys_comet": {"type": "comet", "diameter": "11 km", "temperature": "77 C"},
                    "deimos": {"type": "satellite", "diameter": "12.4km", "temperature": "-40 C"},
                    "ceres": {"type": "asteroid", "diameter": "946 km", "temperature": "-73 C"},
                    "andromeda_galaxy": {"type": "galaxy", "diameter": "2.0814 × 10^18 km",
                                         "temperature": "1,999,726.85 C"},
                    "jupiter": {"type": "planet", "diameter": "139,820 km", "temperature": "-110 C"}}

# method to add item
celestial_bodies["titan"] = {"type": "satellite", "diameter": "5,149.5 km", "temperature": "-40 C"}
print(celestial_bodies)

# method to update item
celestial_bodies["pluto"] = {"type": "exoplanet", "radius": "2,376.6 km", "temperature": "-230 C"}
#print(celestial_bodies)

# method to clear item
celestial_bodies.clear()
#print(celestial_bodies)
