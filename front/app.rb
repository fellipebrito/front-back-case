require "rubygems"
require "sinatra/base"
require "sinatra/reloader"
require "json"
require "open-uri"

class App < Sinatra::Base
  register Sinatra::Reloader
  set :public_folder, File.dirname(__FILE__) + '/public'

  get '/' do
    json = open("http://localhost:8080/").read
    @content = JSON.parse json

    erb :index, :layout => :layout
  end

  get '/aloha' do
    json = open("http://localhost:8080/aloha").read
    @content = JSON.parse json

    erb :index, :layout => :layout
  end
end
