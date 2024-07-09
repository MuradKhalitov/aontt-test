template = """
<insert tableName="organization">
    <column name="full_name" value="Organization {0}"/>
    <column name="short_name" value="Org {0}"/>
    <column name="inn" value="1234567890{1:02d}"/>
    <column name="ogrn" value="12345678900{1:02d}"/>
    <column name="postal_address" value="{2} Main St"/>
    <column name="legal_address" value="{3} Elm St"/>
    <column name="ceo_full_name" value="CEO {0}"/>
    <column name="ceo_birth_date" value="1970-01-01"/>
</insert>
"""

with open('002-insert-test-data.xml', 'w') as f:
    f.write('<?xml version="1.0" encoding="UTF-8"?>\n')
    f.write('<databaseChangeLog\n')
    f.write('    xmlns="http://www.liquibase.org/xml/ns/dbchangelog"\n')
    f.write('    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"\n')
    f.write('    xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog\n')
    f.write('        http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.8.xsd">\n')
    f.write('\n')
    f.write('    <changeSet id="002-insert-test-data" author="yourname">\n')

    for i in range(1, 51):
        f.write(template.format(i, i, 120 + i, 450 + i))

    f.write('    </changeSet>\n')
    f.write('</databaseChangeLog>\n')
