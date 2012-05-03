dataSource {
    dbCreate = 'create-drop' // one of 'create', 'create-drop','update'
    pooled = true
}
hibernate {
	cache.provider_class='org.hibernate.cache.EhCacheProvider'
	cache.use_query_cache=true
	cache.use_second_level_cache=true
	format_sql = false
	naming_strategy = 'org.hibernate.cfg.DefaultNamingStrategy'
	show_sql = false
}
// environment specific settings
environments {
    development {
        dataSource {
			dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
			driverClassName = 'com.mysql.jdbc.Driver'
			username = 'root'
			password = '999plazadrive'
			pooled = true
			url = 'jdbc:mysql://127.0.0.1/g2d'
        }
    }
    test {
        dataSource {
			driverClassName = 'net.sourceforge.jtds.jdbc.Driver'
			dialect = 'org.hibernate.dialect.SQLServerDialect'
			url = 'jdbc:jtds:sqlserver://popeye:1433/g2d'
			username =  'sa'
			password = '999plazadrive'
        }
    }
    production {
        dataSource {
            dbCreate = 'update'
            url = 'jdbc:hsqldb:file:prodDb;shutdown=true'
        }
    }
}
